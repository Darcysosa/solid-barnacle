
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Main {
    @RequestMapping("/")
    String home() {
        return "mi primer api";
    }
    
<html class="no-js"> <!--<![endif]-->
    <head>
        <title>Tecnimotores SOSA</title>

        <!-- meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        
        <!-- stylesheets -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font_icon/css/pe-icon-7-stroke.css">
        <link rel="stylesheet" href="assets/font_icon/css/helper.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.css">
        <link rel="stylesheet" href="assets/css/owl.theme.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- google fonts -->
        <link href='http://fonts.googleapis.com/css?family=Dosis:200,300,400,500|Lato:300,400,700,900,300italic,400italic,700italic,900italic|Raleway:400,200,300,500,100|Titillium+Web:400,200,300italic,300,200italic' rel='stylesheet' type='text/css'>

        <script src="assets/js/modernizr.js"></script>

    </head>
    <body id="body">
        <!--[if lt IE 7]>
                <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <!-- Header area -->
        <header id="header">
            <div class="center text-center">
                <h1 class="bigheadline">SOSA</h1>
                <h4 class="subheadline">-lo mejor para tu vehiculo-</h4>
            </div>
            <div class="bottom">
                <a data-scroll href="#navigation" class="scrollDown animated pulse" id="scrollToContent"><i class="pe-7s-angle-down-circle pe-va"></i></a>
            </div>
        </header>

        <!-- Navigation area -->
        <section id="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-xs-6">
                        <div class="logo"><a data-scroll href="#body" class="logo-text">Edwar sosa</a></div>
                    </div>
                    <div class="col-xs-6">
                        <div class="nav">
                            <a href="#" data-placement="bottom" title="Menu" class="menu" data-toggle="dropdown"><i class="pe-7s-menu"></i></a>
                             <div class="dropdown-menu">
                                 <div class="arrow-up"></div>
                                 <ul>
                                     <li><a data-scroll href="#body">principal <i class="pe-7s-home"></i></a><span class="menu-effect"></span></li>
                                     <li><a data-scroll href="#services">Servicios <i class="pe-7s-config"></i></a><span class="menu-effect"></span></li>
                                     <li><a data-scroll href="#portfolio">perfil<i class="pe-7s-glasses"></i></a><span class="menu-effect"></span></li>
                                     <li><a data-scroll href="#testimonial">Testimonios <i class="pe-7s-comment"></i><span class="menu-effect"></span></a></li>
                                     <li><a data-scroll href="#contact">Contactarnos <i class="pe-7s-help1"></i></a><span class="menu-effect"></span></li>
                                 </ul>
                             </div>
                        </div>
                    </div>

                </div>
            </div>            
        </section>
        
        <!-- Content Area -->

        <!-- services section -->

        <section id="services" class="service-area">
            <div class="container">
                <h2 class="block_title">Servicios</h2>
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="services">
                            <div class="service-wrap">    
                                <i class="pe-7s-science pe-dj pe-va"></i>
                                <h3>carros</h3>
                                <p>reparacion de motores</p>
                            </div>
                        </div>
                        
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="services">
                            <div class="service-wrap">
                                <i class="pe-7s-monitor pe-dj pe-va"></i>
                                <h3>carros</h3>
                                <p>mantenimiento preventivo de suspencion y frenos</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="services">
                            <div class="service-wrap">
                                <i class="pe-7s-edit pe-dj pe-va"></i>
                                <h3>Desbare 24/7</h3>
                                <p>en cualquier parte que estes.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="services">
                            <div class="service-wrap">
                                <i class="pe-7s-config pe-dj pe-va"></i>
                                <h3>escaner</h3>
                                <p>sincronizacion electronica con servicio de escaner</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- services -->

        <!-- Portfolio Area -->

        <section id="portfolio" class="portfolio-area">
            <div class="container">
                <h2 class="block_title">Mis trabajos</h2>
                <div class="row port cs-style-3">
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio1.jpg" alt="img04">
                            <figcaption>
                                <h3>1</h3>
                                <span>tecnimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption>
                        </figure>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio2.jpg" alt="img01">
                            <figcaption>
                                <h3>2</h3>
                                <span>Tecnimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption>
                        </figure>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio3.jpg" alt="img02">
                            <figcaption>
                                <h3>3</h3>
                                <span>Tecnimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption>
                        </figure>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio4.jpg" alt="img04">
                            <figcaption>
                                <h3>4</h3>
                                <span>Tenimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption>
                        </figure>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio5.jpg" alt="img01">
                            <figcaption>
                                <h3>5</h3>
                                <span>Tecnimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption> 
                        </figure>
                    </div>
                    <div class="col-md-4 col-sm-6 col-xs-12 item-space">
                        <figure>
                            <img src="assets/images/portfolio6.jpg" alt="img02">
                            <figcaption>
                                <h3>6</h3>
                                <span>Tecnimotores SOSA</span>
                                <a href="#" class="button" >Take a look</a>
                            </figcaption>
                        </figure>
                    </div>
                    <div class="col-xs-12">
                        <div class="btn-center"><a href="#" class="big button">View all</a></div>
                    </div>
                </div>
            </div><!-- container -->
        </section><!-- portfolio -->

        <!-- Testimonial Area -->

        <section id="testimonial" class="testimonial-area">
            <div class="container">
                <h2 class="block_title">clientes felices</h2>
                <div class="row">
                    <div class="col-xs-12">
                    </div>
                    <div id="testimonial-container" class="col-xs-12">
                        <div class="testimonila-block">
                            <img src="assets/images/testimonial.jpg" alt="clients" class="selfshot">
                            <p>el trabajo del señor edwar hacia mi vehiculo ha sido uno de los mejores,lo recomiendo bastante,ademas de que es una excelente persona.</p>
                            <strong>juan pablo perez</strong>
                            <br>
                            <small>abogado</small>
                        </div>
                        <div class="testimonila-block">
                            <img src="assets/images/testimonial2.jpg" alt="clients" class="selfshot">
                            <p>siempre vengo a hacer mantenimiento a mi carro donde el señor edwar y no lo cambio por ninguno.</p>
                            <strong>ustano</strong>
                            <br>
                            <small>comerciante</small>
                        </div>
                        <div class="testimonila-block">
                            <img src="assets/images/testimonial3.jpg" alt="clients" class="selfshot">
                            <p>muy organizado el trabajo de este taller,estoy contento con los servicios ofrecidos aqui.</p>
                            <strong>edwin hernandez</strong>
                            <br>
                            <small>taxista</small>
                        </div>
                    </div>
                </div>
            </div><!-- container -->
        </section><!-- testimonial -->

        <!-- Contact Area -->

        <section id="contact" class="mapWrap">
            <div id="googleMap" style="width:100%;"></div>
            <div id="contact-area">
                <div class="container">
                    <h2 class="block_title">el lugar indicado !!!</h2>
                    <div class="row">
                        <div class="col-xs-12">
                        </div>
                        <div class="col-sm-6">
                            <div class="moreDetails">
                                <h2 class="con-title">Mas acerca de mi</h2>
                                <p> Hice un tecnologo en el servicio de aprendizaje SENA,y cuento con mas de 20 años de experiencia en el mercado. </p>
                                <ul class="address">
                                    <li><i class="pe-7s-map-marker"></i><span>Barbosa santander<br>CR 10 N 3-28 salida puente nacional</span></li>
                                    <li><i class="pe-7s-mail"></i><span>edwar101023345@gmail.com</span></li>
                                    <li><i class="pe-7s-phone"></i><span>+57 3165843962</span></li>
                                    <li><i class="pe-7s-global"></i><span><a href="#">colombia</a></span></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <h2 class="con-title">para mayor informacion</h2>
                            <form role="form">
                              <div class="form-group">
                                <input type="text" class="form-control" id="user_name" placeholder="Enter your name">
                              </div>
                              <div class="form-group">
                                <input type="email" class="form-control" id="your_email" placeholder="Enter your email">
                              </div>
                              <div class="form-group">
                                <textarea name="InputMessage" id="user_message" class="form-control" rows="5" required></textarea>
                              </div>

                              <button type="submit" class="btn medium">enviar informacion</button>
                            </form>   
                        </div>
                    </div>
                </div><!-- container -->
            </div><!-- contact-area -->
            <div id="social">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">
                            <ul class="scoialinks">
                                <li class="normal-txt">puedes encontrarme</li>
                                <li class="social-icons"><a class="facebook" href="#"></a></li>
                                <li class="social-icons"><a class="twitter" href="#"></a></li>
                                <li class="social-icons"><a class="linkedin" href="#"></a></li>
                                <li class="social-icons"><a class="google-plus" href="#"></a></li>
                                <li class="social-icons"><a class="wordpress" href="#"></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div><!-- social -->
        </section><!-- contact -->

        <!-- Footer Area -->

        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <p class="copyright">© <a href="#" target="_blank">confia en nosotros</a></p>
                    </div>
                    <div class="col-sm-6">
                        <p class="designed">me <a href="http://themewagon.com" target="_blank">darcysosa</a></p>
                    </div>
                </div>
            </div>
        </footer>

        <!-- Necessery scripts -->
        <script src="assets/js/jquery-2.1.3.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
        <script src="assets/js/jquery.actual.min.js"></script>
        <script src="assets/js/smooth-scroll.js"></script>
        <script src="assets/js/owl.carousel.js"></script>
        <script src="assets/js/script.js"></script>

    </body>
</html>

    
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
