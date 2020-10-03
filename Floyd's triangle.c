# include <stdio.h>
int main()
{
	int n,i,j,k=1;
	printf("\n Enter the value of n");
	scanf("%d",&n);
	for(i=0;i<=n;i++)
	{
		printf("\n");
		for(j=1;j<=i;j++)
		{
			printf("%d ",k);
			k=k+1;
		}
	}
	return 0;
}
