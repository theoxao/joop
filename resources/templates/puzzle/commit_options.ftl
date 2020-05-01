<#-- @ftlvariable name="list" type="java.util.List<com.theoxao.model.gitlab.Commit>" -->

<#list list as commit>
    <li class="dropdown-item commit-option ${(commit.tagName)!'tag'}" value="${commit.id}">
        <span class="col-3" style="width: 10%" >[${commit.shortId}]</span>
        <span class="col-3" style="width: 10%" >(${commit.authorName})</span>
        <span class="col-3">${commit.message} </span>
        <span class="col-3" style="color: crimson">${commit.tagName!''}</span>
    </li>
</#list>
