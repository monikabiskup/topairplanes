<#include "headAndMeta.ftl">
<body>
    <#include "navbar.ftl">
    <div class="container-fluid" style="margin-top: 25px">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="panel panel-default">
                    <table class="table">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Name</th>
                            <th scope="col">Producer</th>
                            <th scope="col">Country</th>
                            <th scope="col">Wingspan</th>
                            <th scope="col">Hull length</th>
                        </tr>
                        </thead>
                        <#if biggest_aircrafts?size != 0>
                            <tbody>
                                <#list biggest_aircrafts as b>
                            <tr>
                                <td>${b.getId()}</td>
                                <td>${b.getName()}</td>
                                <td>${b.getProducer()}</td>
                                <td>${b.getCountry()}</td>
                                <td>${b.getWingspan()}</td>
                                <td>${b.getHullLength()}</td>
                            </tr>
                                </#list>
                            </tbody>
                        </#if>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

