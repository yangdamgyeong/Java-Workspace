package kr.ac.kopo.day02;

/*
  *****
  *****
  *****
 */
public class LoopMain01 {
	public static void main(String[] args) {
		/*1) for(int i=0; i<5; i++ ) {
			
			for(int j=0; j<5; j++) {
				System.out.print("*");
			
		}
			System.out.println();
			
		}
		
	}*/
		/*2) for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}

	}*/
		/* 3)for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++){
				System.out.print(j+1);
			}
			System.out.println();
		}
}*/
		/*4)for (int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}*/
		/*5)for (int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}*/
		/*6)for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(j>5) break;
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
		/*7(1)for(int i = 5; i > 0; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
        for(int j = 6; i < j; j--) {
            System.out.print("*");
        }
        System.out.println();

        }
	}*/
		/*7-(2)for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j>=4) {
					System.out.print("*");
				}
				else
					System.out.print("");
			}
			System.out.println();
				
		}
	}*/
		/*8 for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = 0; j <=i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 9 - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
	}*/
		/*for (int i = 0; i<9; i++) {
			if (i<5) {
				for (int j=0; j<5; j++) {
					if(j<4-i)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}else {
				for(int j=0; j<5; j++) {
					if(j<i-4)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}*/
		/*(10)for (int i = 0; i < 5; i++) {
			for(int j = 0; j< 4-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
		/*(11)for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k< 9-(2*i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}*/
	}
}


