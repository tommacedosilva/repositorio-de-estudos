import { useEffect, useState } from "react"
import api from "../api"

const UserForm = ({ fetchUsers, userToEdit, setUserToEdit }) => {

    const [name, setName] = useState('')
    const [email, setEmail] = useState('')

    useEffect(() => {
        if(userToEdit) {
            setName(userToEdit.name)
            setEmail(userToEdit.email)
        }
    }, [userToEdit])

    const handleSubmit = async (event) => {
        // todo: chamada da API
        event.preventDefault()
        try {
            if(userToEdit) {
                // chamar PUT
                await api.put(`/users/${userToEdit.id}`, {
                    name: name,
                    email: email
                })
                setUserToEdit(null)
            } else {
                await api.post('/users', {
                    name: name,
                    email: email
                })
                fetchUsers()
                setName('')
                setEmail('')
            }

        } catch (error) {
            console.log('Falha ao salvar usuário', error);            
        }
    }

    return (
        <form onSubmit={handleSubmit}>
            <input 
                type="text"
                id="name"
                placeholder="Nome de usuário"
                value={name}
            />
            <input 
                type="text"
                id="email"
                placeholder="Email do usuário"
                value={email}
            />
            <button type="submit">Enviar</button>
        </form>
    )
}

export default UserForm