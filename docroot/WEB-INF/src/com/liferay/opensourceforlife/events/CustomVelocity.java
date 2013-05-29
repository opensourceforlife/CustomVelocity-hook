/**
 * 
 */
package com.liferay.opensourceforlife.events;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author Tejas Kanani
 *
 */
public class CustomVelocity extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		
		System.out.println("CustomVelocity.run()");
		Map<String, Object> vmVariables = new HashMap<String, Object>();
		vmVariables.put("mySiteName", "Liferay-OpenSourceForLife");
		
		request.setAttribute(WebKeys.VM_VARIABLES, vmVariables);
	}
	
}
