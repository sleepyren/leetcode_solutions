class Solution(object):
    def maxProfit(self, prices):
        # cannot go back in time so i cannot simply find the max and min of graph
        # you MUST BUY THEN SELL
        # analyze the local minimum and find the greatest differential
        # between that and a local maxima
        max_profit = 0
        min_stock = float('inf')
        for i in range(len(prices)):
            if prices[i] < min_stock:
                min_stock = prices[i]

            if prices[i] - min_stock > max_profit:
                max_profit = prices[i] - min_stock
        return int(max_profit)
##bestTimetoBuyandSellStock easy O(N)
