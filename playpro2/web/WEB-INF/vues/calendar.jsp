<%-- 
    Document   : calendar
    Created on : 9-Oct-2019, 10:12:20 AM
    Author     : nadym
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
