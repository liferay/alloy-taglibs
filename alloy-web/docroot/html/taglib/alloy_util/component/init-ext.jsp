<%
JSONObject optionsJSON = (JSONObject)request.getAttribute("alloy_util:component:optionsJSON");

Object _render = String.valueOf(_options.get("render"));

if (Validator.isNull(_render)) {
	_render = true;
}
else if (_render.equals("true") || _render.equals("false")) {
	_render = GetterUtil.getBoolean((Serializable)_render);
}

optionsJSON.put("render", _render);

boolean useJavaScript = GetterUtil.getBoolean((Serializable)options.get("useJavaScript"), true);
%>