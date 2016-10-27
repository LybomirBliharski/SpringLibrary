<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
    <nav class="navbar navbar-default menu">
  <div class="container">
 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     <!--  <a class="navbar-brand" href="#"><img src="img/logo.png" ></a> -->
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav ">
         <li class="active-link"><a href="/">головна</a></li>
        <li><a href="/news">новини</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">бібліотека <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/books">Книжки</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/authors">Автори</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="/genres">Жанри</a></li>
          </ul>
        </li>
        <li ><a href="#contact" data-toggle="modal">контакти <span class="sr-only">(current)</span></a></li>
        
      </ul>
      <form action="/books/search" class="navbar-form navbar-left" method="get">
        <div class="form-group">
        <select class="btn-group form-control" id="type" name="type">
			<option value="bookname">Назва</option>
			<option value="bookauthor">Автор</option>
  		</select>
          <input type="text" name="name" class="form-control" placeholder="Пошук">
        </div>
        <button type="submit" class="btn btn-default">Шукати</button>
        <!-- Single button -->
<div class="btn-group">
 
</div>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">логін</a></li>
        <li><a href="#">реєстрація</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
    <i class="glyphicon glyphicon-log-in" ></i>
  </div><!-- /.container-fluid -->
</nav>
 <canvas id="canvas-basic"></canvas>
</header>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script href="/resources/js/bootstrap.min.js"></script>
    <script src="/resources/js/main.js"></script>
    
    <!--Contact Us popup window-->
            <div class="modal fade" id="contact" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4><b>Contact Us</b></h4>
                        </div>
                        <div class="modal-body">
                             <form class="form-horizontal" action="" method="post">
                                 <fieldset>
                                    <!-- Name input-->
                                    <div class="form-group">
                                      <label class="col-md-3 control-label" for="name">Name</label>
                                      <div class="col-md-9">
                                        <input id="name" name="name" type="text" placeholder="Your name" class="form-control">
                                      </div>
                                    </div>
    
                                    <!-- Email input-->
                                    <div class="form-group">
                                      <label class="col-md-3 control-label" for="email">Your E-mail</label>
                                      <div class="col-md-9">
                                        <input id="email" name="email" type="text" placeholder="Your email" class="form-control">
                                      </div>
                                    </div>
    
                                    <!-- Message body -->
                                    <div class="form-group">
                                      <label class="col-md-3 control-label" for="message">Your message</label>
                                      <div class="col-md-9">
                                        <textarea class="form-control" id="message" name="message" placeholder="Please enter your message here..." rows="5"></textarea>
                                      </div>
                                    </div>
    
                                 </fieldset>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <a class="btn btn-default" data-dismiss="modal">Close</a>
                           
                            <input type="submit" name="submit" id="submit" value="Send" class="btn btn-info pull-right">
                        </div>
                    </div>
                </div>
            </div>
            <!--End of contact Us popup window-->
            
            <!--Order book popup window-->
            <div class="modal fade" id="order" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4><b>Congrats!</b></h4>
                        </div>
                        <div class="modal-body">
                             <form class="form-horizontal" action="" method="post">
                                 <fieldset>    
    								 We appreciate your choice! Have a nice reading. 
                                 </fieldset>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <a class="btn btn-default" data-dismiss="modal">Close</a>
                           
                            <input type="submit" name="submit" id="submit" value="Send" class="btn btn-info pull-right">
                        </div>
                    </div>
                </div>
            </div>
            <!--End of Order book popup window-->