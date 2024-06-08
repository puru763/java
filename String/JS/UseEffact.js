import "./App.css";
import axios from "axios";
import { useState, useEffect } from "react";

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    const fetchdata = async () => {
      try {
        const reponse = await axios.get(
          "https://jsonplaceholder.typicode.com/posts"
        );
        setData(reponse.data);
      } catch (error) {
        console.log(error);
      }
    };
    fetchdata();
  }, []);

  return (
    <div className="App">
      <h1>Data heading </h1>
      <ul>
        {data.map((item, index) => (
          <li key={index}>{item.body}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
