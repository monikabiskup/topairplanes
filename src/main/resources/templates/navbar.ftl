<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
        <ul class="navbar-nav mr-auto">
            <#if springMacroRequestContext.requestUri?contains("/theBiggestAircrafts")>
                <li class="nav-item active">
            <#else>
                <li class="nav-item">
            </#if>
                <a class="nav-link" href="/top5Aircrafts/theBiggestAircrafts">The biggest aircrafts</a>
            </li>
            <#if springMacroRequestContext.requestUri?contains("/theFastestAircrafts")>
                <li class="nav-item active">
            <#else>
                <li class="nav-item">
            </#if>
                <a class="nav-link" href="/top5Aircrafts/theFastestAircrafts">The fastest aircrafts</a>
            </li>
        </ul>
    </div>
    <div class="mx-auto order-0">
        <a class="navbar-brand mx-auto" href="/top5Aircrafts/">TOP 5</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".dual-collapse2">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
    <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
        <ul class="navbar-nav ml-auto">
            <#if springMacroRequestContext.requestUri?contains("/suggestions")>
                <li class="nav-item active">
            <#else>
                <li class="nav-item">
            </#if>
                <a class="nav-link" href="/top5Aircrafts/suggestions">Suggestions</a>
            </li>
        </ul>
    </div>
</nav>