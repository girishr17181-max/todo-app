
import React, { useEffect, useState } from 'react';

function App() {
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    fetch("/api/todos")
      .then(res => res.json())
      .then(data => setTodos(data));
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>📝 ToDo App</h1>
      <ul>
        {todos.map((todo, i) => <li key={i}>{todo}</li>)}
      </ul>
    </div>
  );
}

export default App;

