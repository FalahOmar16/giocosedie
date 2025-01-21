package giocosedie;

class Display extends Thread

{
	private Posto sedie[];
	private boolean endgame;

	public Display(Posto sedie[]) {


		this.sedie = new Posto[sedie.length];

		for (int s = 0; s < sedie.length; s++)
			this.sedie[s] = sedie[s];
//inizializzazione delle variabili e assegnazione dei posti nell’array sedie[]
	}

	public void run() {

		try {
			while (!endgame) {
				int count = 0;

				sleep((int) (Math.random() * 250));

				for (int i = 0; i < sedie.length; i++) {
				
					if (sedie[i].libero())
						System.out.print("0");
					else {
						count++;
						System.out.print("*");
					}
				}
				System.out.println();
				endgame = (count == sedie.length);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
//controllo dell’occupazione delle sedie , se la sedia è occupata non fa nulla m altrimenti printa 0
