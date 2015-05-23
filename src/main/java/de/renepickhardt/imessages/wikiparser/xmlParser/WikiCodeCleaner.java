/*
 * Copyright (C) 2015 mruster
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.renepickhardt.imessages.wikiparser.xmlParser;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 *
 * @author mruster
 */
public class WikiCodeCleaner {

	private String in;
	private String out;

	public String clean(String in) {
		String[] wordArray = in.split(" ");
		ArrayList<String> wordList = new ArrayList<>();
		for (String word : wordArray) {
			if (!word.isEmpty() && !isValidURI(word)) {

			}

		}
		return null;
	}

	/**
	 *
	 * @param s a String which could be a URI.
	 * @return {@code true} if the String can be transformed into an URI.
	 */
	private boolean isValidURI(String s) {
		try {
			URI uri = new URI(s);
			return true;
		} catch (URISyntaxException ex) {
			return false;
		}
	}
}