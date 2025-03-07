import React from 'react';
import App from './App';
import ReactDOM from "react-dom/client";
import './styles/reset.scss'
import './styles/common.scss'

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);