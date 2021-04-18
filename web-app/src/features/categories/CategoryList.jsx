import React, { useEffect, useState } from 'react';
import { Link } from "react-router-dom";
import { useDispatch } from "react-redux";
import { getCategories } from "../../service/category.service";

export function CategoryList() {

    const dispatch = useDispatch();

    const [categories, setCategories] = useState([]);

    useEffect(() => {
      let mounted = true;
      getCategories()
        .then(items => {
          if(mounted) {
            setCategories(items)
          }
        })
      return () => mounted = false;
    }, [])

    const handleDelete = (id) => {
        dispatch(
          categoryDeleted({ id })
        );
    };

    return (
      <div className="container">
        <div className="row">
          <h1>List of categories</h1>
        </div>
        <div className="row">
            <Link to={ `/add-category` }>
              <button className="btn btn-primary">Add category</button>
            </Link>
        </div>
        <div className="row">
          <table className="table table-striped">
            <thead>
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Code</th>
                <th>Description</th>
                <th>Action</th>
              </tr>
            </thead>
            <tbody>
                {categories.map(({ id, name, code, description }, i) => (
                    <tr key={id}>
                        <td>{id}</td>
                        <td>{name}</td>
                        <td>{code}</td>
                        <td>{description}</td>
                        <td>
                            <button
                              className="btn btn-danger"
                              onClick={() => handleDelete(id)}
                            >
                              Delete
                            </button>

                            <Link to={`/edit-category/${id}`}>
                                <button className="btn btn-success">Edit</button>
                            </Link>
                        </td>
                    </tr>
                ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }