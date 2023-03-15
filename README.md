# ContentCalendarSpringBootProject
* Bu proje, Spring Boot ile geliştirilmiş bir içerik takvim uygulamasıdır. Uygulama, kullanıcıların çeşitli içeriklerini (makaleler, blog yazıları, videolar vb.) takvim üzerinde planlamalarına ve yönetmelerine olanak sağlar.  
* Kullanıcılar, takvime "Makale", "Video" veya "Etkinlik" gibi farklı içerik türlerini ekleyebilirler.  
* İçerikler, başlık, açıklama, durum, oluşturma tarihi ve güncelleme tarihi gibi çeşitli alanları içerebilir.  
* Kullanıcılar, tarihe göre filtreleme yapabilirler.  
* Kullanıcılar, içerikleri aramak için arama kutusunu kullanabilirler.  
* CRUD işlemleri (oluşturma, okuma, güncelleme ve silme) için Restful API'ler sağlanmaktadır.  
* Railway ile birlikte oluşturduğum siteyle web üzerinden testler yapılabilir :  
* Burdan test yapabilirsiniz https://contentcalendarspringbootproject-production.up.railway.app/api/content 

## TEKNOLOJİLER
![Spring Boot 3.0.4](https://img.shields.io/badge/Spring%20Boot-3.0.4-green.svg?style=flat-square&logo=springboot)

![PostgreSQL](https://img.shields.io/badge/PostgreSQL-blue.svg?style=flat-square&logo=postgresql)

![Docker](https://img.shields.io/badge/Docker-blue.svg?style=flat-square&logo=docker)

![Spring MVC](https://img.shields.io/badge/Spring%20MVC-green.svg?style=flat-square&logo=spring)

![Spring Data JDBC](https://img.shields.io/badge/Spring%20Data%20JDBC-green.svg?style=flat-square&logo=spring)

![H2 Database](https://img.shields.io/badge/H2%20Database-orange.svg?style=flat-square&logo=h2)



## Özellikler
### Bu projede bulunan özellikler:

API olarak sunulan web uygulaması  
Veritabanı işlemleri için PostgreSQL kullanımı  
Geliştirme aşamasında kolay test edilebilirlik için H2 veritabanı kullanımı(pom.xml üzerinden H2 eklenip http://localhost:8080/h2-console ile test edilebilir)
Docker kullanımı sayesinde uygulamanın taşınabilirliği  
Railway.com'da canlandırılarak sunulan API  


### Proje, bir CRUD (Create, Read, Update, Delete) sistemi olarak tasarlanmıştır ve aşağıdaki operasyonlar mevcuttur:

POST: Yeni bir aktivite ekleme /api/content  
GET: Tüm aktiviteleri listeleme /api/content  
GET: Belirli bir aktiviteyi listeleme /api/content/{id}   
PUT: Belirli bir aktiviteyi güncelleme /api/content/{id}  
DELETE: Belirli bir aktiviteyi silme /api/content/{id}  

## Kurulum
### Gereksinimler
* Docker
* Java 17

### Kurulum Adımları
* GitHub sayfasından projeyi indirin:
"git clone https://github.com/sudkostik/ContentCalendarSpringBootProject.git"
* Terminalde projenin bulunduğu klasöre gidin:
 "cd ContentCalendarSpringBootProject"
* Docker İmajını Oluşturun:
docker build -t content-calendar .
* Docker container'ı başlatın:
"docker run -p 8081:8080 content-calendar"
* Uygulama, http://localhost:8080 adresinden erişilebilir. 









