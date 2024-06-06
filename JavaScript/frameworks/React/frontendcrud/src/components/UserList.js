import { useEffect, useState } from "react";
import api from "../api";
import UserForm from "./UserForm";

const UserList = () => {

    const [users, setUsers] = useState([])
    const [userToEdit, setUserToEdit] = useState(null)

    const fetchUsers = async () => {
        try {
            const response = await api.get('/users')
            setUsers(response.data)
            

        } catch (error) {
            console.error('Erro ao obter usuários:', error)

        }
    }

    useEffect(() => {
        fetchUsers()
    }, [])

    const handleDelete = async (id) => {
        // TODO: chamar a API enviando o ID
        // usando o método DELETE
        try {
            await api.delete(`/users/${id}`)
            setUsers(users.filter(user=> user.id !== id))

        } catch (error) {
            console.log('Erro ao excluir usuário:', error);
        }
        console.log(id);
    }

    const handleEdit = async (user) => {
        setUserToEdit(user)
    }

    return (
        <>
            <h1>Lista de Usuários</h1>
            <UserForm fetchUsers={fetchUsers} userToEdit={userToEdit} setUserToEdit={setUserToEdit} />
            <ul>
                {users.map(user => (
                    <li key={user.id}>
                        {user.name} - {user.email}
                        <button onClick={() => handleEdit(user)}>Editar</button>
                        <button onClick={() => handleDelete(user.id)}>Excluir</button>
                    </li>
                ))}

            </ul>
        </>
    )
}

export default UserList