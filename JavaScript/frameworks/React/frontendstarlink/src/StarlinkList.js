import React, { useEffect, useState } from "react"
import axios from "axios"

function StarlinkList() {
    const [starlinks, setStarlinks] = useState([])

    useEffect(() => {
        const fetchStarlinks = async () => {
            try {
                const response = await axios.post('https://api.spacexdata.com/v4/starlink/query', {
                    "query": {},
                    "options": { limit: 100 }
                })
                //console.log(response.data.docs)
                setStarlinks(response.data.docs)
            } catch (error) {
                console.error('Erro ao obter dados da api da starlink', error)
            }
        }
        fetchStarlinks()
    }, [])



    return (
        <div>
            <h1>Satélites da Starlink</h1>
            <ul>
                {starlinks.map((sat) => (
                    <li key={sat.id}>{sat.spaceTrack.OBJECT_NAME}</li>
                ))}
            </ul>
        </div>
    )
}

export default StarlinkList