import { axios } from "axios";

export const getCategories() {  
    // fetch data from a url endpoint
    const data = axios.get("http://localhost:8765/category-service/categories");
    return data;
}
