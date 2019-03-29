package com.github.mrzhqiang.learnspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mrzhqiang
 */
@Component
public class GameProperty {
  @Value("${game.url}")
  public String url;
  @Value("${game.path}")
  public String path;
}
