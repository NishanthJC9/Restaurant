import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { GET } from "../api/foodApi";

export const MenuItems = () => {
    const { resId } = useParams();
    const [menu, setMenu] = useState([]);

    useEffect(() => {
        const handleOnload = async () => {
            try {
                const data = await GET(`http://localhost:8080/getRestaurantMenu/${resId}`);
                setMenu(data);
            } catch (error) {
                console.error("Error fetching menu:", error);
            }
        };

        handleOnload();
    }, [resId]);

    return (
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    {menu.map((item) => (
                        <tr key={item.menuId}>
                            <td>{item.itemName}</td>
                            <td>{item.itemPrice}</td>
                            <td>{item.itemDescription}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};
