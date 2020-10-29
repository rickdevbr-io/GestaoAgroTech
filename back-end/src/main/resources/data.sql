DROP TABLE IF EXISTS DRONES;
 
CREATE TABLE DRONES(
  id bigint AUTO_INCREMENT PRIMARY KEY,
  latitude bigint NOT NULL,
  longitude bigint NOT NULL,
  temperatura int NOT NULL,
  humidade bigint NOT NULL
);
 
INSERT INTO DRONES(latitude, longitude, temperatura, humidade) VALUES
  (10, 20, 30, 90);