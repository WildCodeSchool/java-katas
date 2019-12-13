# Spring Dojo 1

## Skills & concepts
 - Create Spring projects with Spring boot
 - Controller
 - URL, query and path parameters

## Goals
 - Create a controller to display "Hi" (raw text) when someone visit _/greet-all_
 - Create a second controller displaying "Hi Randy" (raw text) when someone visit _/greet_ with Randy as query parameter name. Of course it adapts when another name is provided
 - Ensure this parameter is optionnal. The controller displays "Hi Stranger" then
 - Create a third controller displaying "Hi William" when someone visit _/greet/william_. Obviously if the URL contains another name, the controller adapts accordingly