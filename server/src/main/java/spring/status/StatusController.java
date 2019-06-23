package spring.status;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.lang.management.ManagementFactory;

@RestController
public class StatusController {

	@RequestMapping("/api")
	public ResponseEntity getStatus(HttpServletResponse httpServletResponse) {
		String os = ManagementFactory.getOperatingSystemMXBean().getName() + ManagementFactory.getOperatingSystemMXBean().getVersion();
		long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
		long used = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
		long max = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getMax();
		JSONObject memory = new JSONObject();
		memory.put("used", used);
		memory.put("max", max);
		JSONObject response = new JSONObject();
		response.put("server", os);
		response.put("memory", new JSONObject().put("memory", memory));
		response.put("uptime", uptime);
		httpServletResponse.setHeader("Content-Type", "application/json");
		return new ResponseEntity<>(response.toString(), HttpStatus.OK);
	}

}
