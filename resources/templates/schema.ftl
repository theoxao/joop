<!DOCTYPE html>
<html lang="en">
<#include "legos/header.ftl">
<body>

<div class="d-flex" id="wrapper">

    <@mc.sidebar current='schema'/>
    <!-- Page Content -->
    <div id="page-content-wrapper">

        <@mc.nav current='Schema Migrate' />
        <div class="container-fluid">

            <label for="tag-only-switch">
                Show Tags Only
                <input id="tag-only-switch" type="checkbox" name="my-checkbox"/>
            </label>
            <div style="padding-top: 50px"></div>
            <div>
                <div class="input-group">
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split" type="button"
                                data-toggle="dropdown" aria-expanded="false">
                            Current Position
                        </button>
                        <ul class="dropdown-menu current-select" aria-labelledby="dropdownMenuLink"
                            style="height:800px;overflow:scroll">
                        </ul>
                    </div>
                    <span data-toggle="dropdown"  class="form-control current-select-display" style="border-left: none" value=""></span>
                </div>
            </div>
            <div style="padding-top: 30px">

                <div class="input-group">
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split" type="button"
                                data-toggle="dropdown" aria-expanded="false">
                            Target Position
                        </button>
                        <ul class="dropdown-menu target-select" aria-labelledby="dropdownMenuLink"
                            style="height:800px;overflow:scroll">
                        </ul>
                    </div>
                    <span data-toggle="dropdown" class="form-control target-select-display" style="border-left: none" disabled></span>
                </div>

            </div>

            <div style="padding-top: 60px">
                <button  class="btn btn-primary generate-ddl" >Generate</button>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- Bootstrap core JavaScript -->
<script src="../static/vendor/jquery/jquery.min.js"></script>
<script src="../static/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="../static/js/schema.js"></script>
<script src="../static/vendor/bootstrap-switch/js/bootstrap-switch.js"></script>

</body>

</html>
