package de.tfr.thesis.util.html

class Tags {

	static def String tag(String string, String tag) {
		'''<«tag»>«string»</«tag»>'''
	}

	/*** @return &lt;h1&gt;string&lt;/h1&gt; */
	static def String h1(String string) {
		string.tag("h1")
	}

	/*** @return &lt;h2&gt;string&lt;/h2&gt; */
	static def String h2(String string) {
		string.tag("h2")
	}
}