<%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html lang="en"> <!--indicating the language is English-->

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Animal Registration</title>

    <!-- Icons font CSS-->
    <link href="resources/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="resources/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i"
          rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="resources/vendor/select2/select21.min.css" rel="stylesheet" media="all">
    <link href="resources/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="resources/css/main1.css" rel="stylesheet" media="all">
</head>

<body>
<!--USER OPERATIONS-->
<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
    <div class="wrapper wrapper--w790">
        <div class="card card-5">
            <div class="card-heading">
                <h2 class="title">Animal Registration Form</h2>
            </div>
            <div class="card-body">
                <form method="POST">
                    <div class="form-row m-b-55">
                        <div class="name">Animal's Name</div>
                        <div class="value">
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group-desc">
                                        <label>
                                            <input class="input--style-5" type="text" name="animal_name">
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">ID Number</div>
                        <div class="value">
                            <div class="input-group">
                                <label>
                                    <input class="input--style-5" type="text" name="company">
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">D.O.B</div>
                        <div class="value">
                            <label for="theDate"> Date of Birth:</label>

                            <input type="date" id="theDate" name="trip-start"
                                   value="2020-07-22"
                                   min="1900-01-01" max="2090-12-31">
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Diet</div>
                        <div class="value">
                            <div class="input-group">
                                <label>
                                    <input class="input--style-5" type="text" name="diet">
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <!--Select based on animals Gender-->
                        <div class="name">Geneder</div>
                        <div class="value">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="Gender">
                                        <option disabled="disabled" selected="selected">Choose Geneder</option>
                                        <option>Male</option>
                                        <option>Female</option>
                                        <option>Asexual</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <!--Select the animal types-->
                        <div class="name">Animal Type</div>
                        <div class="value">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="Type">
                                        <option disabled="disabled" selected="selected">Choose option</option>
                                        <option>Mammals</option>
                                        <option>Birds</option>
                                        <option>Reptiles</option>
                                        <option>Fish</option>
                                        <option>Invertebrates</option>
                                        <option>Amphibians</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">age</div>
                        <div class="value">
                            <div class="input-group">
                                <label>
                                    <input class="input--style-5" type="number" name="age">
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Weight (LBS-Pounds)</div>
                        <div class="value">
                            <div class="input-group">
                                <label>
                                    <input class="input--style-5" type="number" name="weight">
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="name">Health Status</div>
                        <div class="value">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="Health">
                                        <option disabled="disabled" selected="selected">Select Health</option>
                                        <option>Excellent</option>
                                        <option>Good</option>
                                        <option>Poor</option>
                                        <option>Terminal</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!--ZONE-->
                    <div class="form-row">
                        <div class="name">Zone</div>
                        <div class="value">
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <select name="ZONE">
                                        <option disabled="disabled" selected="selected">Choose Zone</option>
                                        <option>Zone 1 (Alice)</option>
                                        <option>Zone 2 (Martha)</option>
                                        <option>Zone 3 (Beck)</option>
                                        <option>Zone 4 (Tony)</option>
                                    </select>
                                    <div class="select-dropdown"></div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="form-row">
                        <div class="name">Trainer ID</div>
                        <div class="value">
                            <div class="input-group">
                                <label>
                                    <input class="input--style-5" type="number" name="trainerID">
                                </label>
                            </div>
                        </div>
                    </div>
                    <div>
                        <!--BUTTONS TO PERFORM ACTIONS-->
                        <button class="btn btn--radius-2 btn--green" type="submit">Save</button>
                        <button class="btn btn--radius-2 btn--red" type="submit">Cancel</button>
                        <button class="btn btn--radius-2 btn--blue" type="submit">Delete</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- Jquery JS-->
<script src="resources/vendor/jquery/jquery.min.js"></script>
<!-- Vendor JS-->
<script src="resources/vendor/select2/select21.min.js"></script>
<script src="resources/vendor/datepicker/moment.min.js"></script>
<script src="resources/vendor/datepicker/daterangepicker.js"></script>

<!-- Main JS-->
<script src="resources/js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->