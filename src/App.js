import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Button } from 'reactstrap';
import Base from './components/Base';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import Home from './pages/Home';
import Login from './pages/Login';
import Signup from './pages/Signup';
import About from './pages/About';
import UserDetails from './pages/UserDetails'
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import UserDto from './pages/UserDto';
import UserTable from './pages/UserTable';
import Acceptlist from './pages/Acceptlist';
import Userdata from './pages/Userdata';


function App() {
  return (
   <BrowserRouter>
   <ToastContainer/>
   <Routes>
    <Route path="/" element={<Home/>}/>
    <Route path="/login" element={<Login/>}/>
    <Route path="/signup" element={<Signup/>}/>
    <Route path="/about" element={<About/>}/>
    <Route path="/userdetails" element={<UserDetails/>}/>
    <Route path="/UserDto" element={<UserDto/>}/>
    <Route path="/UserTable"element={<UserTable/>}/>
    <Route path="/Acceptlist" element={<Acceptlist/>}/>
    <Route path="/Userdata" element={<Userdata/>}/>

   </Routes>

   </BrowserRouter>

  );
}
export default App;
