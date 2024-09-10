CREATE TABLE IF NOT EXISTS facturas (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          total DECIMAL(10, 2),
                          usuario_id BIGINT
);
