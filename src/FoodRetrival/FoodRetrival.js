import React, { useState } from "react"
import { GET } from "../api/foodApi";
import { useNavigate } from "react-router-dom";

function FoodRetrival() {
    const navigate = useNavigate()
    const [restaurants, setRestaurants] = useState([])
    const fetchRestaurants = async () => {
        // Replace with your actual fetch URL or API endpoint
        const data = await GET('http://localhost:8080/getAllRestaurants');
        setRestaurants(data);
    };

    const handleOnClick = (resId) => {
        navigate(`/menuItems/${resId}`)
    }
    return (
        <div>
            <button onClick={fetchRestaurants}>Fetch Restaurant</button>
            <table>
                <tr>
                    <th>Restaurant Name</th>
                    <th>Email-Id</th>
                    <th>Address</th>
                    <th>Phone Number</th>
                </tr>
                {restaurants.map((restaurant) => (
                    <tr key={restaurant.restaurantId} onClick={() => handleOnClick(restaurant.restaurantId)}>
                        <td>{restaurant.restaurantName}</td>
                        <td>{restaurant.restaurantEmail}</td>
                        <td>{restaurant.restaurantAddress}</td>
                        <td>{restaurant.restaurantPhone}</td>
                    </tr>
                ))}
            </table>
        </div>
    )
}

export default FoodRetrival