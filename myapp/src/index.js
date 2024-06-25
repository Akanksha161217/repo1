import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

function First(){
	return(<h1>This Is My First Componant...</h1>);
}
const root1 = ReactDOM.createRoot(document.getElementById('root1'));
root1.render(<First/>)



var Second=function(){
	return(<h1>This is My Anonymous...</h1>)
}
const root2 = ReactDOM.createRoot(document.getElementById('root2'));
root2.render(<Second/>)

var Third=()=>{
	return(<h1>Arrow Function....</h1>)
}
const root3 = ReactDOM.createRoot(document.getElementById('root3'));
root3.render(<Third/>)


//class based components

class Fourth extends React.Component{
	render(){
		return (		
				<div>
				<h1>This Is Class Based Component....</h1>
				<h2>This Is Last React Component....</h2>
				<p>shfdsjhfkljsdcfksldn chkjvhkjhv</p>
				<p>kkhgfjhjfbfjdbvhjfdghdjkfdgsjdh</p>
				</div>)
	}
}
const root4 = ReactDOM.createRoot(document.getElementById('root4'));
root4.render(<Fourth />)

function MyForm() {
  return (
    <form>
     <h1>Registration Form</h1>
<div>
Full Name:<input  type="text" id="name" placeholder=" Last   First   Middle "  /><br /><br />
BOB:<input  type="date" id=dob" />
<br /><br />

Email Id:<input  type="email" id="email" placeholder="abc@gmail.com"   />
<br /></br>
Mobile Number:<input type=number id=mobile placeholder="91xxxxxxxx" />
<br /><br />


Gender:<input type="radio" id=gender name="gender" />MALE
	<input type="radio" id=gender name="gender "  />FEMALE
	<input type="radio" id=gender  name="gender" />OTHER<br /><br />
Marital Status:<input type=radio id=gender name="status" />Married
	<input type=radio id=gender name="status" />Un-MArried
<br /><br />

Language Know:<input type="checkbox" id=gender name="lang" />Marathi
<input type="checkbox" id=gender name="lang" />Hindi
<input type="checkbox" id=gender name="lang" />English
<br /><br />

Nationality<select>
<option>Indian</option>
<option>UK</option>
<option>US</option>
<option>Canada</option>
</select>
<br /><br />

<center >
<input typ="Submit" type=submit id=submit value="SUBMIT" />

</center>
</div>
    </form>
  );
}
const root5 = ReactDOM.createRoot(document.getElementById('root5'));
root5.render(<MyForm />);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

