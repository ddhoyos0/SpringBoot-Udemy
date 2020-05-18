package com.djhoyos.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "!SpringBoot#2020";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0shM6wJ3p7txo2dGSTAv\n" + 
			"Kv/uLYbSVv+eVgbZRwrWRLlUnT0Scz7+mtxezuqyvFym8qnAJQQo4YwvI2Zdv9tk\n" + 
			"HHqmn/fZZYntcjGON4C7+FTK0vyjOUBsrL7YaYelRck8siC301TEiJq9ZrPg87XC\n" + 
			"v6HybDG1wClBljvo6GGLreVrUCX+yroRbAepctam1qRdZn154N4xe8hEIIsuRn6v\n" + 
			"vy5rSRLr4NCay/mlx13KHQLVwfhlOSyCZcjwGYzKnccFTXRIA3njtkcKApt8oom2\n" + 
			"khBCu9ewuna+bRRvoBQkJ6s//i3esVyG+Qu0eNO9gUjjsjOKFkjQewYQp0EcY2OQ\n" + 
			"dQIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpAIBAAKCAQEA0shM6wJ3p7txo2dGSTAvKv/uLYbSVv+eVgbZRwrWRLlUnT0S\n" + 
			"cz7+mtxezuqyvFym8qnAJQQo4YwvI2Zdv9tkHHqmn/fZZYntcjGON4C7+FTK0vyj\n" + 
			"OUBsrL7YaYelRck8siC301TEiJq9ZrPg87XCv6HybDG1wClBljvo6GGLreVrUCX+\n" + 
			"yroRbAepctam1qRdZn154N4xe8hEIIsuRn6vvy5rSRLr4NCay/mlx13KHQLVwfhl\n" + 
			"OSyCZcjwGYzKnccFTXRIA3njtkcKApt8oom2khBCu9ewuna+bRRvoBQkJ6s//i3e\n" + 
			"sVyG+Qu0eNO9gUjjsjOKFkjQewYQp0EcY2OQdQIDAQABAoIBAAi94eLFQW0lavsZ\n" + 
			"52JVqz8fSiN9Oe/9vfVXZ1945ZYIEahLxh4deLW3ef8e4LbLKOlbfOqMF53zEGlp\n" + 
			"b23rjWVY+NwdjViWtdBMmddXcXRFH/xMGgDf2SH48ETAKWyRggDpNnZ/R39a24wM\n" + 
			"3cF9wkvsTX+LODx1+ZBff7NTiFV34PqTv9tZ9hrTNygXKsXtRVdaiGtcCCzYrhVX\n" + 
			"X8ZC2pAbB6Fkq+C12ym6bYngrtZLGc2lCm9DHyY8LGUyijK9TIhMaILnI2z8EzSa\n" + 
			"Fcjn0FY5s8WttGVxTIN5C1Y4MpuFwTf34s1dzfv6RLA292K+zlbaRVdmC2gMOxjt\n" + 
			"SO8KRGkCgYEA/S7B06x5YQLi1uOJuYIcu+/ky++QdJUSF6R+AjyCISZxv6OBE8Hj\n" + 
			"VtIR5Nf5NSf2yq4p3zQP6hJ/IPTfJzeZecMqMvtuPir/mqlJwSUpz36rQoqIDlG/\n" + 
			"5Fq2xAqIuS8UVNcEcgbVeCsmh0DTdGz6UDN6sSx5w10vT8QDABqjd7MCgYEA1SDB\n" + 
			"8A2xY0qw+W4dwJUjS+H7OGhQOwdoeed5wjUQoqmKZkkMu4vU+iw9WCum0nancUtM\n" + 
			"KU+/4Fg/9E/qijmUp3UaWOkvaB9jS97xb9vJptYrW8z1BQJEg1jb/ilGBLXe/vVT\n" + 
			"vGstQ8IA/kSnmVqNZA6VCbu3DUvWFJre/q3LQzcCgYBPanQ3/ljQekRHHXZc7xgu\n" + 
			"R1BgO9P3Da9wJRO1hd9XoKR7dUEOvnmeCSS9wJUV/GQoLTtLHRyE0qp33veEaKdG\n" + 
			"j1ZUSZPKAljM3Z8Z65tSz6vOon+M5k2nxmCf26IJXGAnQI7PaZ9aI0bhlA7/7RMT\n" + 
			"RyKMIqRLCJbHkXdTeAegiwKBgQDNMj7G2sghKvZ9EDIBCxXyp15yjqxASP+j7uNh\n" + 
			"wimEEuu3Uzm5EAY734Aodc6l76uC/tYTKD86xny8wny0HIAtQifd1pTYEPBPShT2\n" + 
			"d4wM30LbndeBvQ8tzs3wRNivDFPo8VZvoFjyVcUTChK7KV3cKdYAiwTQ/mTdbcap\n" + 
			"ObbrvQKBgQD4qhJiDjQJi0k2cI4HHKh31cDT02ZLSjGAND8XNEevDlkgJBb2Kkax\n" + 
			"fjE6TmJ637MlbczlqoneMcj6PxmsJU/CmL+4z9xvSs4Ath0gAJ3k0cmquIzutFyJ\n" + 
			"TUYdp4HVsa++djzAZzys8pkYYLaICZ2CFL5fZccdLbUT59Rx6Yxvtg==\n" + 
			"-----END RSA PRIVATE KEY-----";

}
