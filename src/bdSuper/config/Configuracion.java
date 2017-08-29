package bdSuper.config;

public class Configuracion {

	private static Configuracion configuracion;

	private String driver;

	private String url;

	private String user;

	private String password;

	public static synchronized Configuracion getInstancia() {
		if (configuracion == null) {
			configuracion = new Configuracion();
		}
		return configuracion;
	}

	/**
	 * 
	 */
	private Configuracion() {
		super();
	}

	/**
	 * @return Returns the driver.
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver
	 *            The driver to set.
	 */
	protected void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return Returns the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            The password to set.
	 */
	protected void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the url.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            The url to set.
	 */
	protected void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return Returns the user.
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            The user to set.
	 */
	protected void setUser(String user) {
		this.user = user;
	}
}
