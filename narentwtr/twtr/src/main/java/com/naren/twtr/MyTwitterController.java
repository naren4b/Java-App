package com.naren.twtr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MyTwitterController.URL)
public class MyTwitterController {

	public static final String URL = "/twtr";

	@Autowired
	private Twitter twitter;

	@RequestMapping(value = "{hashtag}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Tweet> getTweets(@PathVariable final String hashtag) {
		return twitter.searchOperations().search(hashtag, 20).getTweets();
	}
}
