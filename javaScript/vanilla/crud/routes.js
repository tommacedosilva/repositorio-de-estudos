const express = require('express');
const router = express.Router();
const User = require('./models/user');

// Cria novo user
router.post('/users', (req, res) => {
    const { name, email, password } = req.body;
    User.create({ name, email, password })
        .then(user => res.json(user))
        .catch(err => console.log(err));
});

// Pega todes users
router.get('/users', (req, res) => {
    User.findAll()
        .then(users => res.json(users))
        .catch(err => console.log(err));
});

// Pega um user
router.get('/users/:id', (req, res) => {
    const id = req.params.id;
    User.findByPk(id)
        .then(user => res.json(user))
        .catch(err => console.log(err));
});

// Atualiza user
router.put('/users/:id', (req, res) => {
    const id = req.params.id;
    const { name, email, password } = req.body;
    User.findByPk(id)
        .then(user => {
            user.name = name;
            user.email = email;
            user.password = password;
            return user.save();
        })
        .then(user => res.json(user))
        .catch(err => console.log(err));
});

// Deleta user
router.delete('/users/:id', (req, res) => {
    const id = req.params.id;
    User.findByPk(id)
        .then(user => user.destroy())
        .then(() => res.json({ message: 'User deleted successfully.' }))
        .catch(err => console.log(err));
});

module.exports = router;