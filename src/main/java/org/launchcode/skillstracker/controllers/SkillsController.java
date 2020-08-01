package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker() {
        String html =
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                        "<form method='get' action='/hello'>" +
                            "<input type='text' name='coder'>" +
                            "<input type='submit' value='Greet me!'>" +
                        "</form>" +
                    "<h2>Here are some languages to learn:</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>TypeScript</li>" +
                        "</ol>" +
                "</body>";
        return html;
    }

    @GetMapping("hello")
    @ResponseBody
    public String sayHello(@RequestParam String coder) {
        String html =
                "<body>" +
                    "<h1>Hello, "+ coder + "</h1>" +
                "</body>";
        return html;
    }

    @PostMapping("favorites")
    @ResponseBody
    public String favorites(@RequestParam String coder,
                            @RequestParam String firstFavoriteLanguage,
                            @RequestParam String secondFavoriteLanguage,
                            @RequestParam String thirdFavoriteLanguage) {
        String html =
                "<body>" +
                    "<h1>" + coder + "'s favorite programming languages:</h1>" +
                        "<ol>" +
                            "<li>" + firstFavoriteLanguage + "</li>" +
                            "<li>" + secondFavoriteLanguage + "</li>" +
                            "<li>" + thirdFavoriteLanguage + "</li>" +
                        "</ol>" +
                "</body>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String formNameAndLanguages() {
        String htmlForm =
                        "<body>" +
                            "<fieldset>" +
                                "<form method='post' action='/favorites'>" +
                                    "<input type='text' name='coder'><br>" +
                                    "<label>First Favorite Programming Language" +
                                        "<select name='firstFavoriteLanguage'>" +
                                            "<option value='javaScript'>JavaScript</option>" +
                                            "<option value='typeScript'>TypeScript</option>" +
                                            "<option value='java'>Java</option>" +
                                        "</select>" +
                                    "</label><br>" +

                                    "<label>Second Favorite Programming Language" +
                                        "<select name='secondFavoriteLanguage'>" +
                                            "<option value='javaScript'>JavaScript</option>" +
                                            "<option value='typeScript'>TypeScript</option>" +
                                            "<option value='java'>Java</option>" +
                                        "</select>" +
                                    "</label><br>" +

                                    "<label>Third Favorite Programming Language" +
                                        "<select name='thirdFavoriteLanguage'>" +
                                            "<option value='javaScript'>JavaScript</option>" +
                                            "<option value='typeScript'>TypeScript</option>" +
                                            "<option value='java'>Java</option>" +
                                        "</select>" +
                                    "</label><br>" +
                                    "<input type='submit' value='My Favorites'>" +
                                "</form>" +
                            "</fieldset>" +
                        "</body>";

        return htmlForm;
    }

}
