package vn.thehaung;

import io.vertx.core.Vertx;
import vn.thehaung.verticle.MainVerticle;

/**
 * @author : Hau Nguyen
 * @created : 6/26/22
 **/

public class Main {
  public static void main(String[] args) {
    Vertx.vertx().deployVerticle(new MainVerticle());
  }
}
