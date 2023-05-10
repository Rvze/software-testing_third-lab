package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class TestConstants {
    public static Config config = getConfig();

    public static final String URL = config.getString("url");

    static Config getConfig() {
        return ConfigFactory.load("application-test.conf");
    }

}
