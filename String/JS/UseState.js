import { useState } from "react";

function App() {
  const [data, setData] = useState(0);

  const handlei = () => {
    setData(data + 1);
  };

  const handled = () => {
    setData(data - 1);
  };

  return (
    <div className="App">
      <button onClick={handlei}>Increase</button>
      <h1>{data}</h1>
      <button onClick={handled}>Decrease</button>
    </div>
  );
}

export default App;
