<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FitMeUp</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet"/>


    <link rel="stylesheet" href="resources/css/homeStyle.css">

</head>

<body>
<div class="container" ng-app="myApp" ng-controller="newPlaceCtrl">

    <center><h6>FitMeUp</h6></center>

    <div class="alert alert-danger text-center" role="alert" ng-show="apiError">
        <b>API Error : </b>
        <span>{{ apiStatus }}</span>
    </div>

    <div style="float: left">
        <form name="searchForm" novalidate
              ng-submit="search()">
            <div class="input-group">
                <input name="place" type="text" class="form-control"
                       ng-model="searchPlace" required autofocus/>
                <span class="input-group-btn">
                <button class="btn btn-primary"
                        ng-disabled="searchForm.$invalid">Search</button>
            </span>
            </div>
        </form>
    </div>
    <div id="map"></div>

    </form>

</div>
<script src='http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js'></script>
<script src='https://maps.googleapis.com/maps/api/js?key=AIzaSyBXeES3sWdJZ9F27XObc7qcVSLKkDNZO5E&libraries=places'></script>

<script src="resources/js/home.js"></script>
<script>function callback(results, status) {
    if (status === google.maps.places.PlacesServiceStatus.OK) {
        for (var i = 0; i < results.length; i++) {
            createMarker(results[i]);
        }
    }
}

function createMarker(place) {
    var placeLoc = place.geometry.location;
    var marker = new google.maps.Marker({
        map: map,
        position: place.geometry.location
    });

    google.maps.event.addListener(marker, 'click', function() {
        infowindow.setContent(place.name);
        infowindow.open(map, this);
    });
}
</script>

</body>
</html>
