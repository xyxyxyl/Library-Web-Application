import React from "react";
import "./App.css";
import { Navbar } from "./Layouts/NavBarAndFooter/Navbar";
import { Footer } from "./Layouts/NavBarAndFooter/Footer";
import { HomePage } from "./Layouts/HomePage/HomePage";
import { SearchBooksPage } from "./Layouts/SearchBooksPage/SearchBooksPage";
import { Redirect, Route, Switch } from "react-router-dom";

export const App = () => {
  return (
    <div className="d-flex flex-column min-vh-100">
      <Navbar />
      <div className="flex-grow-1">
        <Switch>
          <Route path="/" exact>
            {/* using exact to render only the homepage*/}
            <Redirect to="home" />
          </Route>
          <Route path="/home">
            {/* using exact to render only the homepage*/}
            <HomePage />
          </Route>
          <Route path="/search">
            <SearchBooksPage />
          </Route>
        </Switch>
      </div>
      <Footer />
    </div>
  );
};
