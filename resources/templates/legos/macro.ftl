<#macro nav current>
    <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <div>${current}</div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
</#macro>

<#macro sidebar current>
    <div class="bg-light border-right" id="sidebar-wrapper">
        <div class="sidebar-heading">
            <div>Jooq-based Database</div>
            <div>Version Control System</div>
        </div>
        <div class="list-group list-group-flush">
            <a href="#"
               class="list-group-item list-group-item-action ${('dashboard' == current) ?then('bg-select', 'bg-light')}">Dashboard</a>
            <a href="#"
               class="list-group-item list-group-item-action ${('schema' == current) ?then('bg-select', 'bg-light')}">Schema
                Migration</a>
            <a href="#"
               class="list-group-item list-group-item-action ${('sp' == current) ?then('bg-select', 'bg-light')}">Stored
                Procedure VCS</a>
            <a href="#"
               class="list-group-item list-group-item-action ${('more' == current) ?then('bg-select', 'bg-light')}">More</a>
        </div>
    </div>
</#macro>