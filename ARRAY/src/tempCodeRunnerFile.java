        int top = 0, buttom = row - 1, right = column - 1, left = 0;
        int dir = 0;
        while(top <= buttom && left <= right){
            if(dir == 0){
                for(int i = left; i<=right; i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(dir == 1){
                for(int i = top; i<=buttom; i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(dir == 2){
                for(int i = right; i>=left; i--){
                    System.out.print(arr[buttom][i]+" ");
                }
                buttom--;
            }
            else if(dir == 3){
                for(int i = buttom; i>=top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }