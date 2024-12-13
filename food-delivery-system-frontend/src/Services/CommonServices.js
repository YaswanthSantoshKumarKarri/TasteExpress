import axios from 'axios';

const Common_API_BASE_URL="http://localhost:8081/API/FoodMenu/";

class ClientServices{
    getAllFoods(){
        return axios.get(Common_API_BASE_URL+"All");
    }
}
export default new ClientServices();