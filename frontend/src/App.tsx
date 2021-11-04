import Datatable from "componets/Datatable";
import Footer from "componets/Footer";
import NavBar from "componets/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary" > Olá, Mundo!</h1>
        <Datatable />
      </div>
     <Footer />
    </>
  );
}

export default App;
