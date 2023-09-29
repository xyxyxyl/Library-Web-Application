import React from "react";
import "./App.css";
import { Navbar } from "./Layouts/NavBarAndFooter/Navbar";
import { ExploreTopBooks } from "./Layouts/HomePage/ExploreTopBooks";
import { Carousel } from "./Layouts/HomePage/Carousel";
import { Heros } from "./Layouts/HomePage/Heros";
import { LibraryServices } from "./Layouts/HomePage/LibraryServices";

function App() {
  return (
    <div>
      <Navbar />
      <ExploreTopBooks />
      <Carousel />
      <Heros />
      <LibraryServices />
    </div>
  );
}

export default App;
