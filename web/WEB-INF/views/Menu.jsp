<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 7/10/2018
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>

</head>
<body>
<%--<input type="submit" name ="Appatizers" value="Appatizers">--%>
<%--<input type="submit" name ="Main Course" value="Main Course">--%>
<%--<input type="submit" name ="Bevarages" value="Bevarages">--%>


<nav class='Menu'>
    <ul>
        <li>Appetizers
        <%--<li><a href="/Appatizers">Appatizers</a>--%>
        <ul>
            <li>samosa</li>
            <li>pakora</li>
            <li>soups</li>
        </li>

            <li>Main Course
            <ul>
                <li>Biryani</li>
                <li>Butter Chicken</li>
            </ul>
            </li>

            <li>Beverages

            <ul>
                <li>Tea</li>
            </ul>

            </li>


        </ul>
        </li>

        <%--<li><a href="/MainCourse">MainCourse</a></li>--%>
        <%--<li><a href="/Beverages">Bevarages</a></li>--%>

    </ul>

</nav>
<div class="rowColor">
<div class="col-md-4">
    <label class="btn btn-primary">
        <figure> <img
                src="http://chichilicious.com/wp-content/uploads/Thai-red-curry-recipe.jpg" alt="imgs"
                style="width: 180px; height: 128px;"
                class="img-thumbnail img-check">

            <input type="checkbox" name="Thai" id="item4" value="Thai"
                   autocomplete="off">
            <figcaption> Thai(M) </figcaption>


        </figure>
    </label>

     <label class="btn btn-primary"> <figure> <img
            src="https://i.ytimg.com/vi/e4IIp1c8Ipk/maxresdefault.jpg" alt="imgs"
            style="width: 180px; height: 128px;"
            class="img-thumbnail img-check">

        <input type="checkbox" name="Parmesan" id="item4" value="parmesan"
               autocomplete="off">
        <figcaption> Parmesan Garlic(M) </figcaption>
    </figure>
    </label>

    <label class="btn btn-primary"> <figure> <img
            src="https://images.food52.com/r2wsCDTJdoAB97kLIziNKxAVlic=/753x502/d815e816-4664-472e-990b-d880be41499f--chicken-biryani-recipe.jpg" alt="imgs"
            style="width: 180px; height: 128px;"
            class="img-thumbnail img-check">
        <input type="checkbox" name="chicken_biriyani" id="item4"
               value="chicken biriyani" autocomplete="off">
        <figcaption> Chicken Biryani </figcaption>
    </figure>
    </label>


    <div class="col-md-4">
        <label class="btn btn-primary"> <figure> <img
                src="http://www.ndtv.com/cooks/images/mutton-biryani-new.jpg" alt="imgs"
                style="width: 180px; height: 128px;"
                class="img-thumbnail img-check">

            <ul>
                <li>id</li>
                <li>item</li>
                <li>description</li>
                <li>price</li>
            </ul>
            <input type="checkbox" name="mutton_biriyani" id="item4"
                   value="mutton biriyani" autocomplete="off">
            <figcaption> Mutton Biryani </figcaption>
            <button><a href="/Cart">Submit</a></button>

        </figure>
        </label>
    </div>

</div>
    <div class="cen">

        <button><a href="/Cart">Submit</a></button>

    </div>
</div>


</body>
</html>
