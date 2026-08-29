
import styles from './App.module.css'
import React,{useState} from 'react'

function App() {

  
  const[fahrenheit, setFahrenheit] = useState("");
  const[result , setresult] = useState("");
  const getdata = async () => {
    const response = await fetch("http://localhost:8080/converter/show", {
      method: "POST",
      headers : {
         "Content-Type": "application/json"
      },
      body: JSON.stringify({
        Number: fahrenheit 
      })

    });
      const result= await response.text();
      setresult(result)
  }

  return (
    <>
    <h1  className={`display-1 ${styles.main}`}>temperature Converter</h1>

      
        
        <input type='number' placeholder='enter' value={fahrenheit}
          onChange={(e) => setFahrenheit(e.target.value)} />
        <button className={styles.row2} onClick={getdata}>go</button>
 
       <h2>celsius is : {result}</h2>
      
    </>
  )
}

export default App
