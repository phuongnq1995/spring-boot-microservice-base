import { configureStore } from "@reduxjs/toolkit";
import categoriesReducer from "./actions/CategoryAction";

export default configureStore({
    reducer: {
        categories: categoriesReducer,
    },
});
