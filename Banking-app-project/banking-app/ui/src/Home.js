import React from "react";
import { Link } from "react-router-dom";
import marvel from './images/marvel.gif';
import Register from "./Register";



export default function home() {

    // const tracsactionHandler = (e) => {
    //     e.preventDefault();
    //     return(
    //             <Link to="./"></Link>
    //     )
    // }
    
    return (
        <>
            <>
                <div class="text-center">
                    {/* <h1>Welcome to Dashboard</h1> */}
                    <br/>
                    <p><h1>Please Login first to access ...<br/>
                    This page gives more access to functionality in future updates!!</h1></p>
                    <br/>
                    {/* <img  src={marvel} alt="loading..."/> */}
                    <Link to="/" className="button-17">Already a user Login from here</Link> <br></br> <hr></hr>
                    <Link to="/Register" className="button-17">New user Register from here</Link> <br></br> <hr></hr>
                    <Link to="/Admin" className="button-17">Admin Login here</Link> <hr></hr>

                </div>
                {/* <div className="btns">
                    <button class="button-30" onClick={popMsg}>
                        Passbook
                    </button>
                    <br />
                    <br />
                </div> */}
            </>
            <div>
            {/* <img  src={log} alt="loading..."/> */}
                {/* <button className="button-30" onClick={tracsactionHandler}>Transaction page</button> */}
                {/* <Link to="/" className="button-30" >{" "}
                    Transaction Page{" "}
                </Link>
                <Link to="/" className="button-17">Log out</Link> */}
                <br />
            </div>
        </>
    );
    function popMsg() {
        alert("Your balance is..!");
        //alter {balance} table
    }
}
