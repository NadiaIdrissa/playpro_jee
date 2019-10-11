<%-- 
    Document   : calendar
    Created on : 9-Oct-2019, 10:12:20 AM
    Author     : nadym
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.1.3/darkly/bootstrap.min.css">
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
        <title>Calendrier</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div id="calendar"></div>
        
        <script>
            $('#calendar').fullCalendar({
            header: {
              left: 'prev,next today',
              center: 'addEventButton',
              right: 'month,agendaWeek,agendaDay,listWeek'
            },
            defaultDate: '2018-11-16',
            navLinks: true,
            editable: true,
            eventLimit: true,
            events: [{
                title: 'Simple static event',
                start: '2018-11-16',
                description: 'Super cool event'
              },

            ],
            customButtons: {
              addEventButton: {
                text: 'Add new event',
                click: function () {
                  var dateStr = prompt('Enter date in YYYY-MM-DD format');
                  var date = moment(dateStr);

                  if (date.isValid()) {
                    $('#calendar').fullCalendar('renderEvent', {
                      title: 'Dynamic event',
                      start: date,
                      allDay: true
                    });
                  } else {
                    alert('Invalid Date');
                  }

                }
              }
            },
            dayClick: function (date, jsEvent, view) {
              var date = moment(date);

              if (date.isValid()) {
                $('#calendar').fullCalendar('renderEvent', {
                  title: 'Dynamic event from date click',
                  start: date,
                  allDay: true
                });
              } else {
                alert('Invalid');
              }
            },
          });
        </script>
        
        
        
    </body>
</html>
