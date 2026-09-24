class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        right = 1
        max_profit = 0

        while right < len(prices):
            #agar profitable hai
            if prices[right] > prices[left]:
                profit = prices[right] - prices[left]
                max_profit = max(max_profit, profit)

            else:
                #aaj ka price, buy price se kam hai
                #ye naya minimum hai tw right ki value left mein
                left = right
            
            #agla din check 
            right += 1
        
        return max_profit