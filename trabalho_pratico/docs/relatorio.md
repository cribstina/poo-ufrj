Entregar um relatório individual descrevendo a lógica por
trás de cada método implementado e como foi feita a classe Main. Além disso, discorrer sobre um dos tópicos apresentados ao final do enunciado.

Nesse trabalho, realizamos a implementação de um sistema de uma rede social. A proposta da rede social gira em torno da postagem e manutenção de fotos e vídeos, que podem receber comentários de seu dono e de outros usuários.

Na modelagem da rede social, ambos vídeos e fotos são representados enquanto "Recurso". A classe Recurso é abstrata por não fazer sentido instanciá-la. Instanciaremos "Foto" ou "Vídeo", mas nunca Recurso.

Os objetos que forem postados como "Vídeo" poderão ser classificados como tal mediante a declaração de sua taxa de quadros (frame_rate: int) e de sua duração (duracao: int). Os objetos que forem postados como "Foto", similarmente, deverão ter sua resolução (resolucao: String) declarada.
